package steps

import helloworld.Greeter
import static org.junit.Assert.*

import static cucumber.api.groovy.EN.*

    Given(~/^I say Hello$/) { ->
        // Write code here that turns the phrase above into concrete actions
        greeter = new Greeter()
        greeter.stimulus = "Hello"
    }

    Then(~/^I get the reply, "(.*?)"$/) { String str ->
        assertEquals(str, greeter.greet())
    }
