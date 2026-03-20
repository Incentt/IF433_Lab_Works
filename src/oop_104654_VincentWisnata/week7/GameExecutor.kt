package oop_104654_VincentWisnata.week7

class GameExecutor {
    fun processEvent(event: BattleState){
        when(event){
            is BattleState.MonsterEcounter -> println("Ecounter dengan ${event.monsterName}")
            is BattleState.GameOver -> println("Game over: ${event.reason}")
            is BattleState.LootDropped -> println("LootDropped ${event.item}")
            is BattleState.SafeZone -> println("Safezone")
            else -> println("Loading")
        }
    }
}