class Catatan(val judul: String, val isi: String)

class PengelolaCatatan {
    private val daftarCatatan = mutableListOf<Catatan>()
    
    fun tambahCatatan(catatan: Catatan) {
        daftarCatatan.add(catatan)
    }

fun main() {
    // Debugging punya Haidar, boleh dihapus
    /*
    val note = Catatan("Judul Catatan", "Isi Catatan")
    fun tampilkanCatatan (catatan: Catatan): String {
        return "${catatan.judul}"
    }
    println(tampilkanCatatan(note))
    */
}
