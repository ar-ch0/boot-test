package com.example.demo.config;

import java.util.Map;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.google.common.base.Joiner;

@Aspect
@Component
public class LogAspect {

	private static final Logger logger = LoggerFactory.getLogger(LogAspect.class);

	@Around("within(com.example.demo..*)")
	public Object logging(ProceedingJoinPoint pjp) throws Throwable {

		String params = getRequestParams();

		String type = "";
		String name = pjp.getSignature().getDeclaringTypeName();

		if (name.contains("Controller")) {
			type = "Controller";
		} else if (name.contains("Service")) {
			type = "ServiceImpl";
		} else if (name.contains("Mapper")) {
			type = "Mapper";
		}

		long startAt = System.currentTimeMillis();

		logger.info("{} ====> REQUEST : {}({}) = {}", type, pjp.getSignature().getDeclaringTypeName(),
				pjp.getSignature().getName(), params);

		Object result = pjp.proceed();

		long endAt = System.currentTimeMillis();

		logger.info("{} ====> RESPONSE : {}({}) = {} ({}ms)", type, pjp.getSignature().getDeclaringTypeName(),
				pjp.getSignature().getName(), result, endAt - startAt);

		return result;

	}

	// get requset value
	private String getRequestParams() {

		String params = "";

		RequestAttributes requestAttribute = RequestContextHolder.getRequestAttributes();

		if (requestAttribute != null) {
			HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes())
					.getRequest();

			Map<String, String[]> paramMap = request.getParameterMap();

			if (!paramMap.isEmpty()) {
				params = " [" + paramMapToString(paramMap) + "]";
			}
		}
		return params;
	}

	private String paramMapToString(Map<String, String[]> paramMap) {
		return paramMap.entrySet().stream()
				.map(entry -> String.format("%s -> (%s)", entry.getKey(), Joiner.on(",").join(entry.getValue())))
				.collect(Collectors.joining(", "));
	}
}