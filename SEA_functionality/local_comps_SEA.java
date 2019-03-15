// sum of all comps for a given day (pivots off (L) {local} char in cell)
=SUMPRODUCT(LEN({range}})-LEN(SUBSTITUTE({range}},"(L)","()")))

// EX: implemented for Sat values in Google Sheets
=SUMPRODUCT(LEN(C32:C46)-LEN(SUBSTITUTE(C32:C46,"(L))","()")))


// C-I32:C-I46 is the range for a week of values (7-day week beginning with Sat)
// CTRL+H in notepad and replace C3 w/ D3 && C4 w/ D4 (repeat for E-I)