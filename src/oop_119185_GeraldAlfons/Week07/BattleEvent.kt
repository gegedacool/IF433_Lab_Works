package oop_119185_GeraldAlfons.Week07

sealed class BattleState

// State yang membawa data (payload)
data class MonsterEncounter(val monsterName: String) : BattleState()
data class LootDropped(val item: GameItem) : BattleState()
data class GameOver(val reason: String) : BattleState()

// State sederhana tanpa data
object SafeZone : BattleState()