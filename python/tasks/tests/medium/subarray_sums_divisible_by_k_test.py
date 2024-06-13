import pytest
from tasks.medium.subarray_sums_divisible_by_k import Task974


@pytest.mark.parametrize("arr, k, expected", [([4, 5, 0, -2, -3, 1], 5, 7), ([5], 9, 0)])
def test_subarray_sums_divisible_by_k(arr: list[int], k: int, expected: int) -> None:
    result = Task974().subarraysDivByK(arr, k)
    assert result == expected
