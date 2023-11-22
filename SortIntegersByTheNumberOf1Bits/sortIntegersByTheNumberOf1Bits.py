class Solution:
    def sortByBits(self, arr: List[int]) -> List[int]:
        list = []
        for elem in arr:
            list.append((elem, format(elem, 'b')))
        list = sorted(list, key=lambda pair: (pair[1].count('1'), pair[0]))
        sorted_list = []
        for elem in list:
            sorted_list.append(elem[0])
        return sorted_list