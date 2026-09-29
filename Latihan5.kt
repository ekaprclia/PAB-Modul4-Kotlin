//Eka Septy Pricilia (24523221)

//(Modul 4) Latihan 5: Konfigurasi Aplikasi
enum class CourseStatus { ACTIVE, COMPLETED }

object AppConfig {
    const val MAX_COURSES = 5
}

data class Course(val code: String, val name: String, val status: CourseStatus) {
    companion object {
        const val PREFIX = "PAB"
    }
}

fun MutableList<Course>.addCourse(course: Course): Boolean {
    if (this.size >= AppConfig.MAX_COURSES) {
        return false
    }
    
    if (!course.code.startsWith(Course.PREFIX)) {
        return false
    }
    
    this.add(course)
    return true
}

fun main() {
    val courses = mutableListOf<Course>(
        Course("PAB101", "Mobile App Development", CourseStatus.ACTIVE),
        Course("PAB102", "Web Programming", CourseStatus.COMPLETED),
        Course("PAB103", "UI/UX Design", CourseStatus.ACTIVE)
    )

    println(courses.addCourse(Course("PAB104", "Machine Learning", CourseStatus.ACTIVE)))
    println(courses.addCourse(Course("ABC105", "Cyber Security", CourseStatus.ACTIVE)))

    for (course in courses) {
        println(course)
    }
}
