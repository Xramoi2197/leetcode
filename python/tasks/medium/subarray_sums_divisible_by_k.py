# 974. Subarray Sums Divisible by K
# Given an integer array nums and an integer k, return the number of non-empty
# subarrays that have a sum divisible by k.
#
# A subarray is a contiguous part of an array.
class Task974:
    def subarraysDivByK(self, nums: list[int], k: int) -> int:
        counter = 0
        repeats = self.count_repeats(nums, k)
        for el, count in repeats.items():
            counter += self.count_pos(count)
        return counter

    @staticmethod
    def count_repeats(nums: list[int], k) -> dict[int, int]:
        repeats = {0: 1}
        lst = [0]
        for num in nums:
            res = (lst[-1] + (num % k)) % k
            lst.append(res)
            repeats[res] = repeats.get(res, 0) + 1
        return repeats

    @staticmethod
    def count_pos(num: int) -> int:
        return num * (num - 1) // 2
