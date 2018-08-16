namespace java increment

typedef i32 int

struct Work {
    1: i32 num = 0
}

exception InvalidOperationException {
    1: i32 code,
    2: string description
}

service IncrementService {

    i32 inc(1:i32 num1),

}
