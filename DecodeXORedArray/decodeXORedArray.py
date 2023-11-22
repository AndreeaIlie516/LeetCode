class Solution:
    def decode(self, encoded: List[int], first: int) -> List[int]:
        decoded = []
        decoded.append(first)
        i = 0

        for elem in encoded:
            decoded_elem = elem ^ decoded[i]
            i += 1
            decoded.append(decoded_elem)
        
        return decoded