package org.example

import groovy.transform.CompileStatic


Integer value = 5 // нет примитивных типов данных, происходит автоматический boxing
BigInteger value2 = 10G
BigDecimal value3 = 10.2G

@CompileStatic //
static def test(){

}

