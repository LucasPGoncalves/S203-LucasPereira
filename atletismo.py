class Pessoa(object):
    nome = None
    idade = None

    def __init__(self, nome, idade):
        self.nome = nome
        self.idade = idade

    def envelhecer(self):
        self.idade += 1

class Atleta(Pessoa):
    peso = None
    aposentado = None

    def __init__(self, nome, idade, peso):
        super().__init__(nome, idade)
        self.peso = peso

    def aquecer(self):
        print("Atleta Aquecido")

    def aposentar(self):
        self.aposentado = True

class Corredor(Atleta):

    def correr(self):
        print("Corredor Correndo...")

class Nadador(Atleta):
    
    def nadar(self):
        print("Nadador Nadando...")

class Ciclista(Atleta):

    def pedalar(self):
        print("Ciclista Pedalando...")

corredor_1 = Corredor("Vanderlei", 27, 75)

corredor_1.aquecer()
corredor_1.correr()

#nadador: 
nadador_1 = Nadador("Gustavo", 35, 80)
print("Esta aposentado? ")
if nadador_1.aposentado:
    print("Sim")
else:
    print("Nao")

nadador_1.nadar()
nadador_1.envelhecer()
nadador_1.aposentar()

print("Agora ja esta aposentado? ")
print('Sim' if nadador_1.aposentado else 'Nao')