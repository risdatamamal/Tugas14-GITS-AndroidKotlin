package com.example.tugas12.model

import com.example.tugas12.R
import java.util.ArrayList

object UniversityData {
    private val universityNames = arrayOf(
        "Massachusetts Institute of Technology",
        "Stanford University",
        "Harvard University",
        "University of Oxford",
        "California Institute of Technology (Caltech)",
        "ETH Zurich - Swiss Federal Institute of Technology",
        "University of Cambridge",
        "University College London",
        "Imperial College London",
        "University of Chicago"
    )
    private val universityDetails = arrayOf(
        "adalah institusi riset swasta dan universitas yang terletak di kota Cambridge, Massachusetts tepat di seberang Sungai Charles dari distrik Back Bay di Boston, Amerika Serikat. MIT memiliki 5 sekolah dan satu kolese, mencakup 32 departemen yang mengkhususkan diri pada sains dan penelitian teknologi. Didirikan tahun 1861 sebagai respon atas kemajuan teknologi dan industri di Amerika pada saat itu, universitas ini mengadopsi universitas riset ala Eropa. MIT sekarang berdiri di atas tanah seluas 168 are yang dibuka 1916. Dalam kurun waktu 60 tahun belakangan ini, MIT telah mengembangkan cabang lain seperti manajemen, ekonomi, ilmu politik, dan biologi. Untuk tahun ajaran 2009-2010, MIT memiliki 4,232 mahasiswa sarjana dan 6,152 mahasiswa pascasarjana.",
        "adalah sebuah universitas swasta yang terletak kira-kira 60 kilometer di tenggara San Francisco dan kira-kira 30 km di timur laut San Jose di wilayah Kabupaten Santa Clara yang belum diresmikan sebagai kota. Stanford terletak dekat kota Palo Alto, California, Amerika Serikat tepat di jantung Lembah Silikon baik secara geografis maupun historis.",
        "adalah salah satu universitas paling bergengsi di dunia dan mempunyai pendapatan terbesar di antara universitas-universitas di seluruh dunia (US$22,6 miliar pada tahun 2004), hampir dua kali lipat Universitas Yale, pesaing terdekatnya). ",
        "adalah perguruan tinggi tertua berbahasa Inggris yang berlokasi di kota Oxford, Inggris. Sejarah universitas ini dapat ditelusuri paling tidak mulai akhir abad ke-11, walaupun tanggal tepat pendiriannya tetap tak jelas. Menurut legenda, setelah pecahnya kerusuhan antara mahasiswa dan penduduk kota pada tahun 1209, beberapa akademisi Oxford melarikan diri ke timur laut, ke kota Cambridge, dan mendirikan Universitas Cambridge. Kedua universitas \"kuno\" ini sejak itu telah saling bersaing satu sama lain, dan merupakan dua perguruan tinggi paling selektif di Britania Raya, yang sering dirujuk sebagai \"Oxbridge\". ",
        "adalah perguruan tinggi paling terkemuka dalam riset. Caltech mempertahankan penekanan kuat dalam ilmu alam dan teknik. Caltech memiliki dan mengoperasikan kompleks penerbangan luar angkasa \"autonomous\" yang memimpin di dunia dikenal dengan Jet Propulsion Laboratory. JPS mengamati desain dan operasi dari banyak penjajakan luar angkasa NASA,w11 tidak seperti \"National Laboratories\" (Laboratorium Nasional AS) dan Pusat Luar Angkasa NASA lainnya, fasilitas JPS hanya dalam kontrak ke pemerintah.",
        "adalah perguruan tinggi paling terkemuka di Swiss, yang dalam bahasa Jerman disebut Eidgenössische Technische Hochschule Zürich (ETH Zürich). Lembaga pendidikan tinggi ini berdiri tahun 1854 sebagai universitas negeri milik pemerintah Konfederasi Swiss dan berbeda dari Universitas Zurich yang milik pemerintah canton Zürich.",
        "adalah universitas tertua kedua dalam dunia bahasa Inggris, dengan persyaratan masuk yang paling ketat di Britania Raya, dan salah satu yang paling ketat di dunia. Universitas Oxford dan Cambridge, sering dijuluki Oxbridge, telah memiliki sejarah kompetisi yang lama satu sama lain, dan dipandang luas sebagai universitas paling elit dan bergengsi di Britania Raya. Berdasarkan sejarah, mereka telah menghasilkan sejumlah ilmuwan, penulis, dan politisi Britania yang terkenal.",
        "adalah universitas riset publik di London, Inggris dan perguruan tinggi konstituen dari federasi Universitas London. University College London dianggap sebagai salah satu universitas paling bergengsi di dunia dan merupakan lembaga pendidikan tinggi terbesar di area London. Universitas ini adalah institusi pascasarjana terbesar di Inggris.",
        "adalah perguruan tinggi negeri riset di Inggris. Didirikan oleh Pangeran Albert, perguruan ini didirikan untuk menggiatkan pendidikan di bidang sains, perdagangan, dan seni, terdiri dari Natural History Museum, Museum Victoria dan Albert, Science Museum, Royal Albert Hall dan Imperial Institute.",
        "adalah sebuah universitas swasta, yang terletak di tepi danau Michigan dan Chicago Loop di kota Chicago, Illinois, Amerika Serikat. Universitas Chicago didirikan oleh pengusaha minyak dermawan bernama John D. Rockefeller pada tahun 1890; William Rainey Harper menjadi presiden atau rektor pertama pada tahun 1891 dan kelas-kelas pertama diadakan pada tahun 1892. Universitas Chicago merupakan salah satu perguruan tinggi paling prestisius berdasarkan peringkat nasional dan internasional."
    )
    private val universityImages = intArrayOf(
        R.drawable.mit,
        R.drawable.su,
        R.drawable.harvarduniversity,
        R.drawable.uo,
        R.drawable.california,
        R.drawable.eth,
        R.drawable.uc,
        R.drawable.ucl,
        R.drawable.icl,
        R.drawable.uchi
    )
    val listData: ArrayList<University>
        get() {
            val list = ArrayList<University>()
            for (position in universityNames.indices) {
                val university = University()
                university.name = universityNames[position]
                university.detail = universityDetails[position]
                university.photo = universityImages[position]
                list.add(university)
            }
            return list
        }
}