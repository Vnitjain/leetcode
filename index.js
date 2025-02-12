function timeConversion(s) {
  let [hours, min, sec] = s.split(":");
  let ampm = sec.slice(2);
  sec = sec.slice(0, 2);
  if (ampm == "PM") {
    if (hours !== "12") hours = String(parseInt(hours) + 12);
  } else {
    if (hours === "12") {
      hours = "00";
    }
  }
  return [hours, min, sec].join(":");
}

timeConversion("07:05:45PM");
