package micronaut.hello

import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Produces

@Controller("/hello")
class HelloController {
    @Get
    @Produces(MediaType.APPLICATION_JSON)
    fun hello() = object {
            val message = "hello"
        }
}