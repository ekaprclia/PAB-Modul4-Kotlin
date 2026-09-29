//Eka Septy Pricilia (24523221)

//(Modul 4) Latihan 3: Tag Keahlian Unik
fun main() {
    val skills = mutableSetOf("Kotlin", "Java")
    
    skills.add("Python")
    skills.add("Kotlin")
    
    println("Ukuran Set: ${skills.size}")
    
    println("Apakah Swift ada? ${"Swift" in skills}")
    println("Apakah Python ada? ${"Python" in skills}")
}

//Ukuran Set tidak bertambah saat "Kotlin" ditambahkan karena "Kotlin" sudah ada di dalam Set,
//sehingga Set hanya menyimpan setiap elemen satu kali (tidak membuat elemen baru).  
