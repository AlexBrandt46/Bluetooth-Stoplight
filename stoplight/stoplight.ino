const int LED_PIN = 13;
char inputByte = 'z';

void setup() {
  Serial.begin(9600);
  pinMode(LED_PIN, OUTPUT);
}

void loop() {
  Serial.println("test");
  while (Serial.available() > 0) {
    inputByte = Serial.read();
    Serial.println(inputByte);

    if (inputByte == 'Z') {
      digitalWrite(LED_PIN, HIGH);
    } else if (inputByte == 'z') {
      digitalWrite(LED_PIN, LOW);
    }
  }
}
