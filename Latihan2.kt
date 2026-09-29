//Eka Septy Pricilia (24523221)

//(Modul 4) Latihan 2: Deskripsi Status
enum class CourseStatus { ACTIVE, COMPLETED, DROPPED }

data class Course(val code: String, val name: String, val status: CourseStatus)

fun Course.displayInfo(): String = "$code - $name - $status"

fun describe(status: CourseStatus): String = when (status){
    CourseStatus.ACTIVE -> "Mata kuliah sedang aktif"
    CourseStatus.COMPLETED -> "Mata kuliah sudah selesai"
    CourseStatus.DROPPED -> "Mata kuliah dibatalkan"
}

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
        println(describe(course.status))
    }
    
    val (code, name, status) = courses[0]
    println("Hasil Destructuring:")
    println("Kode: $code, Nama: $name, Status: $status")
}
