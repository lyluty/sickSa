function formatDate(intVal) {
  var date = new Date(intVal);
  
  var year = checkZero(date.getFullYear() + '');
  var month = checkZero(date.getMonth() + 1 + '');
  var day = checkZero(date.getDate() + '');
  var hour = checkZero(date.getHours() + '');
  var minutes = checkZero(date.getMinutes() + '');
  var seconds = checkZero(date.getSeconds() + '');
  
  return year + '-' + month + '-' + day + ' ' + hour + ':' + minutes + ':' + seconds;
}

function checkZero(data) {
  if (data.length == 1) {
    data = '0' + data;
  }
  return data;
}