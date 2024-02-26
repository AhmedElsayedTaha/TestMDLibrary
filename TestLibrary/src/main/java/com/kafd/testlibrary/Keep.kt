package com.kafd.testlibrary

import java.lang.annotation.ElementType

import java.lang.annotation.RetentionPolicy


@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.TYPE, AnnotationTarget.CLASS)
annotation class Keep
