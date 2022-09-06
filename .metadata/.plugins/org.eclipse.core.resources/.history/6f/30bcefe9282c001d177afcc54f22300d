package com.aman.springcloud;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;

import reactor.core.publisher.Mono;
@Component
public class CustomFilter implements GlobalFilter {

	@Override
	public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
		// TODO Auto-generated method stub
		System.out.println("pre filter calling"+exchange.getRequest());
		return chain.filter(exchange).then(Mono.fromRunnable(()->{
			System.out.println("post processing logic"+exchange.getResponse());
		}));
	}

}
