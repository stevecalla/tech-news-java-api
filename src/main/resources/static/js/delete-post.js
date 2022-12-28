async function deleteFormHandler(event) {
  event.preventDefault();

  document.location.replace('/dashboard')

//  const id = window.location.toString().split('/')[
//    window.location.toString().split('/').length - 1
//  ];
//
//  const response = await fetch(`/api/posts/${id}`, {
//    method: 'DELETE'
//  });
//
//  if (response.ok) {
//    document.location.replace('/dashboard')
//  } else {
////    document.location.replace('/dashboard')
//    alert(response.statusText);
//  }
}

//document.querySelector('.delete-post-btn').addEventListener('click', deleteFormHandler);