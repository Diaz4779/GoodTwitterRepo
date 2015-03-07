function assert(){
	if [[ "$1" = "$2" ]]; then
		echo success;
		exit 0
	else
		echo Error: $1 does not equal $2
		exit 1
	fi
}

actual=`java -cp /home/vagrant/test/target/test-1.0-SNAPSHOT.jar com.example.test.App jdiazflores@csumb.edu 3`
expected="[bjaramillo@csumb.edu, jdiazflores@csumb.edu, marivera@csumb.edu]"

assert "$actual" "$expected"
