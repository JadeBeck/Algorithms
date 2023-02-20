function cookies(k, A) {
    let i = 0,    // "Pointer" for A to avoid the need to shift
        j = 0,      // "Pointer" for C to avoid the need to shift
        n = 0,      // Number of operations
        a, b, res,  // Aux
        C = []      // Array with the calculated values

    // Sort the initial array
    A.sort((a, b) => a - b);

    // Some shortcuts to speedup the edges
    if (A[0] >= k) return 0;
    if (A.length < 2) return -1;

    // Iterate while there are values in one of the arrays
    // C.lenght-1 has to do with the formula C[j] + 2 * C[j + 1]
    while (i < A.length || j < C.length - 1) {

        // In case A is empty, use only C
        if (i >= A.length) {
            res = C[j] + 2 * C[j + 1];
            j += 2;  // Same effect of shift() twice, but less expensive
        } else {
            // Take the min between the two arrays
            // j >= C.length avoids error in the first run, where C is empty
            if (A[i] < C[j] || j >= C.length) {
                a = A[i];
                i++;
            } else {
                a = C[j];
                j++;
            }

            // Take the second smallest value
            // j >= C.length avoids error when there is no C[j] (remember previous j++)
            if (A[i] < C[j] || j >= C.length) {
                b = A[i];
                i++;
            } else {
                b = C[j];
                j++;
            }
            res = a + 2 * b;
        }

        C.push(res); // Push the new calculated value
        n++;         // Increment count

        // Finish when the min value of both stacks are >= k
        // or A is empty (i >= A.length) and min C >=k
        if ((A[i] >= k || i >= A.length) && C[j] >= k) return n;
    }

    // If the last number isn't enough, then it's not possible
    return -1;
}