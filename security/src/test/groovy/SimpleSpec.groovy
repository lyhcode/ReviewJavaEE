import spock.lang.Specification
import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*

class SimpleSpec extends Specification {
	def baseUrl = 'http://localhost:8080'

	def "Security Constraint: GET"() {
		given: 'setup http client'
		def http = new HTTPBuilder(baseUrl)
		
		when: 'send request'
		def statusCode = null
		def resultText = null

		def resp = http.request(GET, HTML) {
			uri.path = '/security/Bar/Baz'

			response.success = {
				resp, html ->
println html.class.name
				resultText = html.toString()
				statusCode = resp.status
			}
		}

		then: 'result ok'
		statusCode == 200
		resultText == 'Http Method = GET'
	}
}
