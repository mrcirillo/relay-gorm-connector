package io.cirill.relay

import io.cirill.relay.annotation.RelayArgument
import io.cirill.relay.annotation.RelayField
import io.cirill.relay.annotation.RelayType

/**
 * Created by mcirillo on 2/15/16.
 */

@RelayType(description = 'A person')
class Person {

    static hasMany = [ pets: Pet ]

    static constraints = {

    }

    @RelayField(description = 'A person\'s name')
    @RelayArgument(description = 'A person\'s name', nullable = true)
    String name

    @RelayField
    @RelayArgument(description = 'A person\'s age', nullable = true)
    int age

    //String notRelayField

    @RelayField
    @RelayArgument(description = 'Best friend\'s id')
    Person bestFriend

    @RelayField
    List<Pet> pets

}
