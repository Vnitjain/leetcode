def dayOfProgrammer(year):
    days_in_month = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
    totalDays = 256
    month = 0
    if year <= 1917:
        if year % 4 == 0:
            days_in_month[1] = 29
    elif year >= 1919:
        if (year % 4 == 0 and year % 100 != 0) or (year % 400 == 0):
            days_in_month[1] = 29
    elif year == 1918:
        totalDays += 13
    while totalDays >= 30:
        totalDays -= days_in_month[month]
        month += 1
    return (
        (str(totalDays) if len(str(totalDays)) == 2 else "0" + str(totalDays))
        + "."
        + (str(month + 1) if len(str(month + 1)) == 2 else "0" + str(month + 1))
        + "."
        + str(year)
    )


dayOfProgrammer(1701)
dayOfProgrammer(1704)
dayOfProgrammer(2017)
print(dayOfProgrammer(1918))
