package helloworld
/**
 * Created by kmoore on 2014-10-29.
 */
class Greeter {

    String stimulus
    String response

    String greet() {
        response = ' World!'
        return stimulus + response
    }

}
