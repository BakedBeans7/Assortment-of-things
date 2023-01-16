

print("Welcome to the dice roll probability generator!")
print("")
print("")
print("")
yyyy = input("Press enter to continue:")

from random import randint 
trials = 100000
success = 0
for trial in range(trials):
		faces = set()
		for rolls in range(6):
			roll = randint(1, 6)
			faces.add(roll)
		if len(faces) == 6:
			success += 1
print("100000 trials completed:")
print("Probability of success = {}".format(success/trials))

yyyy = input("Press Enter to Exit:")