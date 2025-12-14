use core::num;

fn main() {
    let i1 = String::from("2080-02-29");
    let o1 = String::from("100000100000-10-11101");
    let t1 = Solution::convert_date_to_binary(i1);
    print!("{}",t1);
}

struct Solution {}

impl Solution {
    pub fn convert_date_to_binary(date: String) -> String {
        let mut solString = "".to_string();
        for (i,num) in date.split("-").enumerate() {
            let mut curr = match num.parse::<i32>() {
                Ok(value) => value,
                Err(_) => 0,
            };
            let mut currBin = String::new();
            if i!=0{
                solString.push('-');
            }
            while curr != 0 {
                currBin = (if curr % 2 == 0 { '0' } else { '1' }).to_string() + &currBin;
                curr = &curr / 2;
            }
            solString.push_str(&currBin);
        }
        return solString;
    }
}
