import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.request.*

class NewsRepository(private val client: HttpClient) {
    private val baseUrl = "https://jsonplaceholder.typicode.com"

    suspend fun getNews(): Result<List<Post>> {
        return try {
            val response: List<Post> = client.get("$baseUrl/posts").body()
            Result.success(response)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
}