package oop_104654_VincentWisnata.week9

//(Keterangan: roe adalah Return on Equity dalam persentase, status bisa "OPEN" atau "CLOSED").
data class TradeLog(val pair: String,
                    val position: String,
                    val leverage: Int,
                    val roe: Double,
                    val status: String)


