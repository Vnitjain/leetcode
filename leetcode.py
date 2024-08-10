def stones(n, a, b):
    # Create a set to store unique sums
    unique_sums = set()

    # Generate sums using a loop
    for i in range(n):
        unique_sums.add(a * i + b * (n - 1 - i))

    # Return the sorted list of unique sums
    return sorted(unique_sums)


# Example usage
print(stones(3, 1, 2))  # Output: [2, 3, 4]
