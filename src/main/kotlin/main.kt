import kotlin.js.json

const val DEFAULT_PORT = 3001

fun main(args: Array<String>) {
	println("Hello, Node.kt!")

	val express = require("express")
	val app = express()

	app.get("/", { _, res ->
		res.type("text/json")
		res.send(json("message" to "Hello, Node.kt"))
	})

	val port = process.env.PORT ?: DEFAULT_PORT

	app.listen(port, {
		println("Listening on port $port")
	})
}