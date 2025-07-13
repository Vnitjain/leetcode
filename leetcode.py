class Solution:
    def matchPlayersAndTrainers(self, players: List[int], trainers: List[int]) -> int:
        players = sorted(players)
        trainers = sorted(trainers)

        i = len(players)-1
        j = len(trainers)-1

        matches = 0

        while(i>-1 and j>-1):
            currentPlayer = players[i]
            currentTrainer = trainers[j]
            if(currentPlayer<=currentTrainer):
                matches+=1
                i-=1
                j-=1
            else:
                i-=1
        return matches