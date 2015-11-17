package main
import (
    "fmt"
    "bufio"
    "os"
    "strconv"
)

func main() {
    var i float64
    reader := bufio.NewReader(os.Stdin)
    sum := 0.0
    
    // Read the first line.
    text, _, err := reader.ReadLine()
        
    if err != nil {
        fmt.Print("0.0")
    }
    
    // The number of lines that will follow.
    n, _ := strconv.Atoi(string(text))
    
    for j := 0; j < n; j++  {
        text, _, _ := reader.ReadLine()
        i, _ = strconv.ParseFloat(string(text), 64)
        sum += i / 2
    }
    
    fmt.Print(strconv.FormatFloat(sum, 'f', 1, 64))
}