<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>



		<!-- Modal  start-->
			<div class="modal"  id="waitModal" role="dialog" tabindex="-1"  aria-labelledby="restModal" aria-hidden="true">
				<div class="modal-dialog">

					<!-- Modal content-->
					<div class="modal-content">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal">&times;</button>
						
							<h4 class="modal-title">대기현황</h4>
						</div>
						<div class="modal-body">
					
							<p> ${waitCnt} 명 대기중입니다. </p>
							<p> 대기 명단에 등록하시겠습니까? </p>
							
				
						</div>

						<div class="modal-footer">
							<button type="button" class="btn btn-default"
								data-dismiss="modal">Close</button>
							<button type="button" class="btn btn-primary">Yes</button>
						</div>
					</div>
					<!-- modal content  end-->

				</div>
				<!-- /.modal-dialog -->
			</div>
			<!-- /.modal-content -->

