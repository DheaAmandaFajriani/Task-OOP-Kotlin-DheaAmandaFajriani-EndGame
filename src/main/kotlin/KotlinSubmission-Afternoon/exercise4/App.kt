package id.infinitelearning.KotlinSubmission.exercise4

fun main() {


    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    // Buat di bawah sini
    try {
        // Minta pengguna untuk memasukkan angka
        print("Masukkan sebuah angka: ")
        val userInput = readLine()

        // Mencoba mengonversi input pengguna ke dalam tipe data Int
        val number = userInput!!.toInt()

        // Jika berhasil, cetak hasilnya
        println("Angka yang dimasukkan: $number")
    } catch (e: NumberFormatException) {
        // Menangani kesalahan jika pengguna memasukkan sesuatu yang bukan angka
        println("Terjadi kesalahan: ${e.message}")
    }
}
/**Dalam contoh ini, kita mencoba mengonversi input pengguna (userInput) ke dalam tipe data Int.
 *  Jika pengguna memasukkan sesuatu yang bukan angka, maka blok catch akan menangkap exception
 *  NumberFormatException dan menangani kesalahan tersebut dengan mencetak pesan kesalahan.
 */
