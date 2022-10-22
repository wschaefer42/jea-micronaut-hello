package micronaut.hello

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.PathVariable

@Controller("/greeting")
class GreetingController {
    @Get("/{lang}")
    fun getGreeting(@PathVariable lang: String) = object {
        val message = when (lang) {
            "de" -> "Hallo"
            "ch" -> "Grüzi"
            "at" -> "Servus"
            "en" -> "Hi"
            "fr" -> "Bonjour"
            else -> "Hello"
        }
    }
}