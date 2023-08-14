from carro import Carro
from brinquedo import Brinquedo

class CarroDeBrinquedo(Carro, Brinquedo):
    def __init__(self, modelo, cor, ano, faixa_etaria, material):
        Carro.__init__(self, modelo, cor, ano)
        Brinquedo.__init__(self, faixa_etaria, material)

    def __str__(self):
        return super().__str__()     
