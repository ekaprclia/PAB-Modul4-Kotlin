//Eka Septy Pricilia (24523221)

//(Modul 4) Latihan 1: Program Mata Kuliah Mahasiswa
enum class CourseStatus { ACTIVE, COMPLETED }

data class Course(val code: String, val name: String, val status: CourseStatus)

fun Course.displayInfo(): String = "$code - $name - $status"

fun main() {
    val courses = mutableListOf<Course>(
        Course("PAB101", "Mobile App Development", CourseStatus.ACTIVE),
        Course("PAB102", "Web Programming", CourseStatus.COMPLETED), 
        Course("PAB103", "UI/UX Design", CourseStatus.ACTIVE)
    )

    courses.add(Course("PAB104", "Machine Learning", CourseStatus.ACTIVE))
    courses.removeAt(1) 

    for (course in courses) {
        println(course.displayInfo())
    }

    val (code, name, status) = courses[0]
    println("Hasil Destructuring:")
    println("Kode: $code, Nama: $name, Status: $status")
}
