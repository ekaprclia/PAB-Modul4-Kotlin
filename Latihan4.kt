//Eka Septy Pricilia (24523221)

//(Modul 4) Latihan 4: Daftar Nilai
fun main() {
    val scores = mutableMapOf<Int, Int>(24523991 to 85, 24523992 to 90, 24523993 to 78)
    
    scores[24523991] = 95
    
    scores.remove(24523993)
    
    for ((nim, score) in scores){
        println("NIM: $nim, Nilai: $score")
    }
    
    println("Nilai untuk NIM 24523994: ${scores[24523994]}")
}
