#!/usr/bin/env bash

entr -cr ./run.sh "$1" <<< "$(fd -ejava .)"
