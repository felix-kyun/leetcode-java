#!/usr/bin/env bash

if (( $# < 1 )); then
    echo "Please provide the problem number"
fi

cat > "./src/main/java/problems/p${1}.java" <<EOF
package problems;

public class p${1} {
    public static void main(String[] args) {

    }
}
EOF
