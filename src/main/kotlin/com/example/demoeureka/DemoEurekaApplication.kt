package com.example.demoeureka

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@EnableEurekaServer /* EnableEurekaServer 어노테이션으로 유레카 서버 가동, 이 스프링 어플리케이션은 유레카 서버로서 동작하게 됨 */
@SpringBootApplication
class DemoEurekaApplication

fun main(args: Array<String>) {
    runApplication<DemoEurekaApplication>(*args)
}
