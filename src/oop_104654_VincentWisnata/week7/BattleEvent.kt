package oop_104654_VincentWisnata.week7

sealed class BattleState {
    data class MonsterEcounter(val monsterName: String) : BattleState()
    data class LootDropped(val item: GameItem) : BattleState()
    data class GameOver(val reason: String) : BattleState()
    object SafeZone : BattleState()
}