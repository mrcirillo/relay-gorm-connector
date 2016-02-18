package io.cirill.relay

import grails.test.mixin.integration.Integration
import grails.transaction.Rollback
import io.cirill.relay.test.Shared
import org.springframework.beans.factory.annotation.Autowired
import spock.lang.Specification

import static io.cirill.relay.test.Helpers.mapsAreEqual

@Integration
@Rollback
class RelayAsGrailsServiceSpec extends Specification {

    @Autowired
    RelayService relayService

    def "Validate schema as service"() {
        given:
        def query =  Shared.QUERY_SCHEMA_QUERYTYPE_FIELDS
        Map expected = Shared.EXPECTED_SCHEMA_QUERYTYPE_FIELDS


        when:
        def result = relayService.query query

        then:
        assert mapsAreEqual(result.data as Map, expected)
    }
}
