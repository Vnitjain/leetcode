fn main() {
    let s = Solution::to_lower_case(String::from("HELLO"));
    print!("{}",s);
}

struct Solution{

}

impl Solution {
    pub fn to_lower_case(s: String) -> String {
        let mut result = String::new(); 
        for characters in s.chars(){
            result.push(characters.to_ascii_lowercase());
        }
        return s
    }
}