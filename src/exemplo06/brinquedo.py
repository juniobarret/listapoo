class Brinquedo:
    _faixa_etaria = None
    _material = None

    def __init__(self, faixa_etaria, material):
        self._faixa_etaria = faixa_etaria
        self._material = material
    
    def getFaixaEtaria(self):
        return self._faixa_etaria
    
    def getMaterial(self):
        return self._material

    def __str__(self):
        return f'Faixa Etária: {self._faixa_etaria}, Material: {self._material}'