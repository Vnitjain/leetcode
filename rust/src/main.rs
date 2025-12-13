fn main() {
}


struct Solution{

}

impl Solution {
    pub fn answer_queries(nums: Vec<i32>, queries: Vec<i32>) -> Vec<i32> {
        let mut n = nums;
        n.sort();
        for i in 1..n.len(){
            n[i] += n[i-1];
        }
        print!("{:?}",n);
        let mut q = queries;
        for i in 0..q.len(){
            match n.binary_search(&q[i]) {
                Ok(index) => 
                    q[i] = (index+1) as i32,
                Err(index) => q[i]=index as i32,
            }
        }
        return q;
    }
}