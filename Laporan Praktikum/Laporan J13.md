# LAPORAN JOBSHEET 13 PRAKTIKUM ALGORITMA DAN STRUKTUR DATA

Dibuat oleh : <p>
Yasmine Navisha Andhani <p>
1F D4 Teknik Informatika <p>
2141720047 <p>

## 2.1 Implementasi Binary Search Tree menggunakan Linked List
### 2.1.1 Tahapan Percobaan
<img src="2.1.1 - a.PNG"> <p>
<img src="2.1.1 - b.PNG"> <p>

1. Buatlah class Node, BinaryTree dan BinaryTreeMain
2. Di dalam class Node, tambahkan atribut data, left dan right, serta konstruktor default dan berparameter. <p>
<img src="2.1.1 - 2.PNG"> <p>
3. Di dalam class BinaryTree, tambahkan atribut root. <p>
<img src="2.1.1 - 3.PNG"> <p>
4. Tambahkan konstruktor default dan method isEmpty() di dalam class BinaryTree <p>
<img src="2.1.1 - 4.PNG"> <p>
5. Tambahkan method add() di dalam class BinaryTree. Di bawah ini proses penambahan node tidak dilakukan secara rekursif, agar lebih mudah dilihat alur proses penambahan node dalam tree. Sebenarnya, jika dilakukan dengan proses rekursif, penulisan kode akan lebih efisien. <p>
<img src="2.1.1 - 5.PNG"> <p>
6. Tambahkan method find() <p>
<img src="2.1.1 - 6.PNG"> <p>
7. Tambahkan method traversePreOrder(), traverseInOrder() dan
traversePostOrder(). Method traverse digunakan untuk mengunjungi dan menampilkan node-node dalam tree, baik dalam mode pre-order, in-order maupun post-order. <p>
<img src="2.1.1 - 7.PNG"> <p>
8. Tambahkan method getSuccessor(). Method ini akan digunakan ketika proses penghapusan node yang memiliki 2 child <p>
<img src="2.1.1 - 8.PNG"> <p>
9. Tambahkan method delete(). Di dalam method delete tambahkan pengecekan apakah tree kosong, dan jika tidak cari posisi node yang akan di hapus.<p>
<img src="2.1.1 - 9.PNG"> <p>
Kemudian tambahkan proses penghapusan terhadap node current yang telah ditemukan. <p>
<img src="2.1.1 - 9a.PNG"> <p>
<img src="2.1.1 - 9b.PNG"> <p>
10. Buka class BinaryTreeMain dan tambahkan method main().<p>
<img src="2.1.1 - 10.PNG"> <p>
11. Compile dan jalankan class BinaryTreeMain untuk mendapatkan simulasi jalannya program tree yang telah dibuat. <p>
<img src="2.1.1 - 11.PNG"> <p>
12. Amati hasil running tersebut.

### 2.1.2 Pertanyaan Perobaan
1. Mengapa dalam binary search tree proses pencarian data bisa lebih efektif dilakukan dibanding binary tree biasa?
> : Karena leftchild lebih kecil nilainya dibandingkan dengan rightchild dan parent 
2. Untuk apakah di class Node, kegunaan dari atribut left dan right?
> : Digunakan untuk mengarahkan root (parent) ke leftchild atau rightchild
3. a. Untuk apakah kegunaan dari atribut root di dalam class BinaryTree?
> : Menyimpan data dalam tree<p>
b. Ketika objek tree pertama kali dibuat, apakah nilai dari root? <p>
> : Null (tidak ada)
4. Ketika tree masih kosong, dan akan ditambahkan sebuah node baru, proses apa yang akan terjadi?
> : method add
5. Perhatikan method add(), di dalamnya terdapat baris program seperti di bawah ini. Jelaskan secara detil untuk apa baris program tersebut? <p>
<img src="2.1.2 - 5.PNG"> <p>
> : Jika data yang dimasukkan kurang dari data yang ada dan data left tidak kosong maka data yang akan dimasukkan menjadi child dari current left. Namun, jika data current left kosong maka data yang baru akan menjadi leftchild.

## 2.2 Implementasi Binary Tree dengan Array
### 2.2.1 Percobaan
1. Di dalam percobaan implementasi binary tree dengan array ini, data tree disimpan dalam array dan langsung dimasukan dari method main(), dan selanjutnya akan disimulasikan proses traversal secara inOrder.
2. Buatlah class BinaryTreeArray dan BinaryTreeArrayMain
3. Buat atribut data dan idxLast di dalam class BinaryTreeArray. Buat juga method populateData() dan traverseInOrder(). <p>
<img src="2.2.1 - 3.PNG"> <p>
4. Kemudian dalam class BinaryTreeArrayMain buat method main() seperti gambar berikut ini. <p>
<img src="2.2.1 - 4.PNG"> <p>
5. Jalankan class BinaryTreeArrayMain dan amati hasilnya! <p>
<img src="2.2.1 - 5.PNG"> <p>

### 2.2.2 Pertanyaan Percobaan
1. Apakah kegunaan dari atribut data dan idxLast yang ada di class BinaryTreeArray?
> : data = untuk menyimpan data array <p>
idxLast = untuk menyimpan index batas
2. Apakah kegunaan dari method populateData()?
> : untuk meng-inisialisasi data dan idxLast
3. Apakah kegunaan dari method traverseInOrder()?
> : untuk mencetak semua node
4. Jika suatu node binary tree disimpan dalam array indeks 2, maka di indeks berapakah posisi left child dan rigth child masin-masing?
> : leftchild = indeks ke-5 <p>
rightchild = indeks ke-6
5. Apa kegunaan statement int idxLast = 6 pada praktikum 2 percobaan nomor 4?
> : sebagai batas indeks yaitu 6

## 2.3 Tugas Praktikum
1. Buat method di dalam class BinaryTree yang akan menambahkan node dengan cara rekursif. <p>
<img src="2.3 - 1.PNG"> <p>
2. Buat method di dalam class BinaryTree untuk menampilkan nilai paling kecil dan yang paling besar yang ada di dalam tree.<p>
<img src="2.3 - 2.PNG"> <p>
3. Buat method di dalam class BinaryTree untuk menampilkan data yang ada di leaf. <p>
<img src="2.3 - 3.PNG"> <p>
4. Buat method di dalam class BinaryTree untuk menampilkan berapa jumlah leaf yang ada di dalam tree. <p>
<img src="2.3 - 4.PNG"> <p>
<img src="2.3 - 4a.PNG"> <p>
5. Modifikasi class BinaryTreeArray, dan tambahkan : <p>
• method add(int data) untuk memasukan data ke dalam tree <p>
<img src="2.3 - 5a.PNG"> <p>
• method traversePreOrder() dan traversePostOrder()<p>
<img src="2.3 - 5b.PNG"> <p>
<img src="2.3 - 5c.PNG"> <p>