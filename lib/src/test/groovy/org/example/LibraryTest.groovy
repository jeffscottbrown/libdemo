package org.example

import spock.lang.Specification

class LibraryTest extends Specification {
    def "someLibraryMethod returns true"() {
        setup:
        def lib = new Library()

        when:
        def result = lib.getName()

        then:
        result == "Jerry Garcia"
    }
}
